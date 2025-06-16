import React, { useState, useEffect } from 'react';
import { fetchSkills } from '../services/api';

const Skills = () => {
  const [skillsData, setSkillsData] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    const loadSkillsData = async () => {
      try {
        setLoading(true);
        const data = await fetchSkills();
        setSkillsData(data);
        setError(null);
      } catch (err) {
        console.error('Error fetching skills:', err);
        setError(err.message);
        // Fallback data in case of error
        setSkillsData({
          "Languages": ["Java", "JavaScript", "Python", "TypeScript", "SQL"],
          "Frameworks": ["Spring Boot", "React", "Node.js", "Express", "Django"],
          "Databases": ["PostgreSQL", "MongoDB", "MySQL", "Redis"],
          "AI Tools": ["ChatGPT API", "TensorFlow", "scikit-learn", "OpenAI API"],
          "Dev Tools": ["Git", "Docker", "VS Code", "IntelliJ IDEA", "Postman"]
        });
      } finally {
        setLoading(false);
      }
    };
    loadSkillsData();
  }, []);

  if (loading) {
    return (
      <section id="skills" className="py-5">
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
      <section id="skills" className="py-5">
        <div className="container">
          <div className="alert alert-danger text-center" role="alert">
            Error: {error}
          </div>
        </div>
      </section>
    );
  }

  return (
    <section id="skills" className="py-5">
      <div className="container">
        <h2 className="h2 fw-bold text-center mb-5 ai-text">Skills & Expertise</h2>
        <div className="row g-4">
          {Object.entries(skillsData).map(([category, skills], index) => (
            <div key={category} className="col-md-6 col-lg-4">
              <div className="ai-card h-100 p-4">
                <h3 className="h4 fw-bold mb-4 ai-text">{category}</h3>
                <div className="d-flex flex-wrap gap-2">
                  {skills.map((skill, skillIndex) => (
                    <span key={skillIndex} className="ai-skill-badge">
                      {skill}
                    </span>
                  ))}
                </div>
              </div>
            </div>
          ))}
        </div>
      </div>
    </section>
  );
};

export default Skills; 