import React, { useState, useEffect } from 'react';
import { fetchAbout } from '../services/api';
import profileImage from '../assets/images/profile.png';

const About = () => {
  const [aboutData, setAboutData] = useState(null);
  const [error, setError] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const loadAboutData = async () => {
      try {
        setLoading(true);
        const data = await fetchAbout();
        setAboutData(data);
        setError(null);
      } catch (error) {
        console.error('Error fetching about data:', error);
        setError('Failed to load about information');
        // Fallback data in case of error
        setAboutData({
          name: 'Omkar Salunkhe',
          title: 'Full Stack Developer',
          description: 'Passionate developer with expertise in Java, Spring Boot, React, and modern web technologies. I love building scalable and efficient applications that solve real-world problems.'
        });
      } finally {
        setLoading(false);
      }
    };

    loadAboutData();
  }, []);

  if (loading) {
    return (
      <section id="about" className="py-5 min-vh-100 d-flex align-items-center justify-content-center">
        <div className="ai-loading"></div>
      </section>
    );
  }

  if (error) {
    return (
      <section id="about" className="py-5 min-vh-100 d-flex align-items-center">
        <div className="container">
          <div className="alert alert-danger text-center animate__animated animate__fadeIn" role="alert">
            {error}
          </div>
        </div>
      </section>
    );
  }

  return (
    <section id="about" className="py-5 min-vh-100 d-flex align-items-center">
      <div className="container">
        <div className="row align-items-center g-5">
          <div className="col-md-6 order-md-2 animate__animated animate__zoomIn animate__delay-1s">
            <div className="ai-border p-2">
              <img
                src={profileImage}
                alt={aboutData.name}
                className="img-fluid rounded animate__animated animate__pulse animate__infinite"
                onError={(e) => {
                  e.target.src = 'https://via.placeholder.com/600x400?text=Omkar+Salunkhe';
                }}
              />
            </div>
          </div>
          <div className="col-md-6 order-md-1 animate__animated animate__fadeInLeft animate__delay-0.5s">
            <h2 className="display-4 fw-bold mb-3">
              Hi, I'm <span className="ai-text">{aboutData.name}</span>
            </h2>
            <h3 className="mb-4 ai-text animate__animated animate__fadeIn animate__delay-1s">
              {aboutData.title}
            </h3>
            <p className="lead mb-4 animate__animated animate__fadeInUp animate__delay-1.5s">
              {aboutData.description}
            </p>
            <div className="d-flex gap-3 animate__animated animate__fadeInUp animate__delay-2s">
              <a href="#contact" className="ai-button">
                Contact Me
              </a>
              <a
                href="#projects"
                className="ai-button"
              >
                View Projects
              </a>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
};

export default About; 