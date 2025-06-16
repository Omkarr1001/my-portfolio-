import React, { useState, useEffect } from 'react';
import { fetchCertifications } from '../services/api';

const Certifications = () => {
  const [certifications, setCertifications] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    const loadCertifications = async () => {
      try {
        setLoading(true);
        const data = await fetchCertifications();
        setCertifications(data);
        setError(null);
      } catch (err) {
        console.error('Error fetching certifications:', err);
        setError(err.message);
        // Fallback data in case of error
        setCertifications([
          {
            id: '1',
            title: 'AWS Certified Developer – Associate',
            issuer: 'Amazon Web Services',
            date: 'May 2023',
            description: 'Demonstrated proficiency in developing, deploying, and debugging cloud-based applications using AWS services.'
          },
          {
            id: '2',
            title: 'Oracle Certified Professional, Java SE 11 Developer',
            issuer: 'Oracle',
            date: 'Nov 2022',
            description: 'Validated advanced-level Java programming skills and in-depth knowledge of Java SE 11.'
          }
        ]);
      } finally {
        setLoading(false);
      }
    };
    loadCertifications();
  }, []);

  if (loading) {
    return (
      <section id="certifications" className="py-5">
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
      <section id="certifications" className="py-5">
        <div className="container">
          <div className="alert alert-danger text-center" role="alert">
            Error: {error}
          </div>
        </div>
      </section>
    );
  }

  return (
    <section id="certifications" className="py-5">
      <div className="container">
        <h2 className="h2 fw-bold text-center mb-5 ai-text">Certifications</h2>
        <div className="row g-4">
          {certifications.map((cert, index) => (
            <div key={cert.id} className="col-md-6 col-lg-4">
              <div className="ai-card h-100 p-4">
                <div className="card-body d-flex flex-column">
                  <h3 className="h4 fw-bold mb-2 ai-text">{cert.title}</h3>
                  <p className="card-subtitle mb-2 text-muted">{cert.issuer}</p>
                  <p className="card-text mb-3"><i className="far fa-calendar-alt me-2"></i>{cert.date}</p>
                  <p className="card-text flex-grow-1">{cert.description}</p>
                </div>
              </div>
            </div>
          ))}
        </div>
      </div>
    </section>
  );
};

export default Certifications; 