import React, { useState, useEffect } from 'react';
import { fetchProjects } from '../services/api';

const Projects = () => {
  const [projects, setProjects] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    const loadProjects = async () => {
      try {
        setLoading(true);
        const data = await fetchProjects();
        setProjects(data);
        setError(null);
      } catch (err) {
        console.error('Error fetching projects:', err);
        setError(err.message);
        // Fallback data in case of error
        setProjects([
          {
            id: 1,
            name: 'Skillbridge',
            description: 'Developed a full-stack platform helping learners upskill through real-world projects.',
            tags: ['Full-stack', 'GitHub Actions'],
            githubUrl: '#',
            demoUrl: '#'
          },
          {
            id: 2,
            name: 'Resume Ranker',
            description: 'Used HuggingFace and LLMs for ranking and summarizing resumes.',
            tags: ['NLP', 'HuggingFace', 'AI'],
            githubUrl: '#',
            demoUrl: '#'
          }
        ]);
      } finally {
        setLoading(false);
      }
    };

    loadProjects();
  }, []);

  if (loading) {
    return (
      <section id="projects" className="py-5">
        <div className="container">
          <div className="d-flex justify-content-center">
            <div className="ai-loading"></div>
          </div>
        </div>
      </section>
    );
  }

  if (error) {
    return (
      <section id="projects" className="py-5">
        <div className="container">
          <div className="alert alert-danger text-center" role="alert">
            Error: {error}
          </div>
        </div>
      </section>
    );
  }

  return (
    <section id="projects" className="py-5">
      <div className="container">
        <h2 className="h2 fw-bold text-center mb-5 ai-text">Featured Projects</h2>
        <div className="row g-4">
          {projects.map((project, index) => (
            <div key={project.id} className="col-md-6 col-lg-4">
              <div className="ai-card h-100 p-4">
                <div className="card-body d-flex flex-column">
                  <h3 className="h4 fw-bold mb-3 ai-text">{project.name}</h3>
                  <p className="card-text mb-4">{project.description}</p>
                  <div className="d-flex flex-wrap gap-2 mb-4">
                    {project.tags.map((tag, tagIndex) => (
                      <span key={tagIndex} className="ai-skill-badge">
                        {tag}
                      </span>
                    ))}
                  </div>
                  <div className="d-flex justify-content-between align-items-center mt-auto pt-3 border-top border-secondary">
                    {project.githubUrl && (
                      <a
                        href={project.githubUrl}
                        target="_blank"
                        rel="noopener noreferrer"
                        className="ai-button"
                      >
                        GitHub <i className="fab fa-github"></i>
                      </a>
                    )}
                    {project.demoUrl && (
                      <a
                        href={project.demoUrl}
                        target="_blank"
                        rel="noopener noreferrer"
                        className="ai-button"
                      >
                        Demo <i className="fas fa-external-link-alt"></i>
                      </a>
                    )}
                  </div>
                </div>
              </div>
            </div>
          ))}
        </div>
      </div>
    </section>
  );
};

export default Projects; 