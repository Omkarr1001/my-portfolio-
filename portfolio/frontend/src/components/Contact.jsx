import React, { useState } from 'react';
import { submitContactForm } from '../services/api';

const Contact = () => {
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    message: ''
  });
  const [submissionStatus, setSubmissionStatus] = useState(null); // 'success', 'error', 'submitting'

  const handleSubmit = async (e) => {
    e.preventDefault();
    setSubmissionStatus('submitting');
    try {
      const response = await submitContactForm(formData);
      console.log('Form submission response:', response);
      setSubmissionStatus('success');
      setFormData({ name: '', email: '', message: '' }); // Reset form
    } catch (error) {
      console.error('Error submitting form:', error);
      setSubmissionStatus('error');
    }
  };

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  };

  if (submissionStatus === 'success') {
    return (
      <section id="contact" className="py-5">
        <div className="container">
          <h2 className="h2 fw-bold text-center mb-5 ai-text">Contact Me</h2>
          <div className="row g-4">
            <div className="col-md-6">
              <div className="ai-card p-4 h-100">
                <h3 className="h4 fw-bold mb-4 ai-text">Get in Touch</h3>
                <address className="d-flex flex-column gap-3 fs-5">
                  <a href="mailto:your.email@example.com" className="text-decoration-none d-flex align-items-center text-light hover-ai-text">
                    <i className="fas fa-envelope me-3 ai-text"></i> your.email@example.com
                  </a>
                  <a
                    href="https://linkedin.com/in/yourprofile"
                    target="_blank"
                    rel="noopener noreferrer"
                    className="text-decoration-none d-flex align-items-center text-light hover-ai-text"
                  >
                    <i className="fab fa-linkedin me-3 ai-text"></i> LinkedIn Profile
                  </a>
                  <a
                    href="https://github.com/yourusername"
                    target="_blank"
                    rel="noopener noreferrer"
                    className="text-decoration-none d-flex align-items-center text-light hover-ai-text"
                  >
                    <i className="fab fa-github me-3 ai-text"></i> GitHub Profile
                  </a>
                </address>
                <div className="mt-4">
                  <p className="text-muted">Feel free to reach out to me via email or connect on social media!</p>
                </div>
              </div>
            </div>
            <div className="col-md-6">
              <div className="ai-card p-4 h-100">
                <h3 className="h4 fw-bold mb-4 ai-text">Send a Message</h3>
                <form onSubmit={handleSubmit} className="row g-3 needs-validation" noValidate>
                  <div className="col-12">
                    <label htmlFor="name" className="form-label text-light">Name</label>
                    <input
                      type="text"
                      className="form-control ai-input"
                      id="name"
                      name="name"
                      value={formData.name}
                      onChange={handleChange}
                      required
                    />
                    <div className="invalid-feedback">
                      Please enter your name.
                    </div>
                  </div>
                  <div className="col-12">
                    <label htmlFor="email" className="form-label text-light">Email</label>
                    <input
                      type="email"
                      className="form-control ai-input"
                      id="email"
                      name="email"
                      value={formData.email}
                      onChange={handleChange}
                      required
                    />
                    <div className="invalid-feedback">
                      Please enter a valid email address.
                    </div>
                  </div>
                  <div className="col-12">
                    <label htmlFor="message" className="form-label text-light">Message</label>
                    <textarea
                      className="form-control ai-input"
                      id="message"
                      name="message"
                      value={formData.message}
                      onChange={handleChange}
                      rows="5"
                      required
                    ></textarea>
                    <div className="invalid-feedback">
                      Please enter your message.
                    </div>
                  </div>
                  <div className="col-12 mt-4">
                    <button type="submit" className="ai-button w-100" disabled={submissionStatus === 'submitting'}>
                      {submissionStatus === 'submitting' ? (
                        <span className="spinner-border spinner-border-sm me-2" role="status" aria-hidden="true"></span>
                      ) : (
                        <i className="fas fa-paper-plane me-2"></i>
                      )}
                      {submissionStatus === 'submitting' ? 'Sending...' : 'Send Message'}
                    </button>
                  </div>
                  {submissionStatus === 'success' && (
                    <div className="col-12 mt-3 animate__animated animate__fadeIn">
                      <div className="ai-card alert alert-success border-success text-success bg-transparent" role="alert">
                        Message sent successfully! <i className="fas fa-check-circle ms-2"></i>
                      </div>
                    </div>
                  )}
                  {submissionStatus === 'error' && (
                    <div className="col-12 mt-3 animate__animated animate__fadeIn">
                      <div className="ai-card alert alert-danger border-danger text-danger bg-transparent" role="alert">
                        Failed to send message. Please try again later. <i className="fas fa-exclamation-triangle ms-2"></i>
                      </div>
                    </div>
                  )}
                </form>
              </div>
            </div>
          </div>
        </div>
      </section>
    );
  }

  if (submissionStatus === 'error') {
    return (
      <section id="contact" className="py-5">
        <div className="container">
          <h2 className="h2 fw-bold text-center mb-5 ai-text">Contact Me</h2>
          <div className="row g-4">
            <div className="col-md-6">
              <div className="ai-card p-4 h-100">
                <h3 className="h4 fw-bold mb-4 ai-text">Get in Touch</h3>
                <address className="d-flex flex-column gap-3 fs-5">
                  <a href="mailto:your.email@example.com" className="text-decoration-none d-flex align-items-center text-light hover-ai-text">
                    <i className="fas fa-envelope me-3 ai-text"></i> your.email@example.com
                  </a>
                  <a
                    href="https://linkedin.com/in/yourprofile"
                    target="_blank"
                    rel="noopener noreferrer"
                    className="text-decoration-none d-flex align-items-center text-light hover-ai-text"
                  >
                    <i className="fab fa-linkedin me-3 ai-text"></i> LinkedIn Profile
                  </a>
                  <a
                    href="https://github.com/yourusername"
                    target="_blank"
                    rel="noopener noreferrer"
                    className="text-decoration-none d-flex align-items-center text-light hover-ai-text"
                  >
                    <i className="fab fa-github me-3 ai-text"></i> GitHub Profile
                  </a>
                </address>
                <div className="mt-4">
                  <p className="text-muted">Feel free to reach out to me via email or connect on social media!</p>
                </div>
              </div>
            </div>
            <div className="col-md-6">
              <div className="ai-card p-4 h-100">
                <h3 className="h4 fw-bold mb-4 ai-text">Send a Message</h3>
                <form onSubmit={handleSubmit} className="row g-3 needs-validation" noValidate>
                  <div className="col-12">
                    <label htmlFor="name" className="form-label text-light">Name</label>
                    <input
                      type="text"
                      className="form-control ai-input"
                      id="name"
                      name="name"
                      value={formData.name}
                      onChange={handleChange}
                      required
                    />
                    <div className="invalid-feedback">
                      Please enter your name.
                    </div>
                  </div>
                  <div className="col-12">
                    <label htmlFor="email" className="form-label text-light">Email</label>
                    <input
                      type="email"
                      className="form-control ai-input"
                      id="email"
                      name="email"
                      value={formData.email}
                      onChange={handleChange}
                      required
                    />
                    <div className="invalid-feedback">
                      Please enter a valid email address.
                    </div>
                  </div>
                  <div className="col-12">
                    <label htmlFor="message" className="form-label text-light">Message</label>
                    <textarea
                      className="form-control ai-input"
                      id="message"
                      name="message"
                      value={formData.message}
                      onChange={handleChange}
                      rows="5"
                      required
                    ></textarea>
                    <div className="invalid-feedback">
                      Please enter your message.
                    </div>
                  </div>
                  <div className="col-12 mt-4">
                    <button type="submit" className="ai-button w-100" disabled={submissionStatus === 'submitting'}>
                      {submissionStatus === 'submitting' ? (
                        <span className="spinner-border spinner-border-sm me-2" role="status" aria-hidden="true"></span>
                      ) : (
                        <i className="fas fa-paper-plane me-2"></i>
                      )}
                      {submissionStatus === 'submitting' ? 'Sending...' : 'Send Message'}
                    </button>
                  </div>
                  {submissionStatus === 'success' && (
                    <div className="col-12 mt-3 animate__animated animate__fadeIn">
                      <div className="ai-card alert alert-success border-success text-success bg-transparent" role="alert">
                        Message sent successfully! <i className="fas fa-check-circle ms-2"></i>
                      </div>
                    </div>
                  )}
                  {submissionStatus === 'error' && (
                    <div className="col-12 mt-3 animate__animated animate__fadeIn">
                      <div className="ai-card alert alert-danger border-danger text-danger bg-transparent" role="alert">
                        Failed to send message. Please try again later. <i className="fas fa-exclamation-triangle ms-2"></i>
                      </div>
                    </div>
                  )}
                </form>
              </div>
            </div>
          </div>
        </div>
      </section>
    );
  }

  return (
    <section id="contact" className="py-5">
      <div className="container">
        <h2 className="h2 fw-bold text-center mb-5 ai-text">Contact Me</h2>
        <div className="row g-4">
          <div className="col-md-6">
            <div className="ai-card p-4 h-100">
              <h3 className="h4 fw-bold mb-4 ai-text">Get in Touch</h3>
              <address className="d-flex flex-column gap-3 fs-5">
                <a href="mailto:your.email@example.com" className="text-decoration-none d-flex align-items-center text-light hover-ai-text">
                  <i className="fas fa-envelope me-3 ai-text"></i> your.email@example.com
                </a>
                <a
                  href="https://linkedin.com/in/yourprofile"
                  target="_blank"
                  rel="noopener noreferrer"
                  className="text-decoration-none d-flex align-items-center text-light hover-ai-text"
                >
                  <i className="fab fa-linkedin me-3 ai-text"></i> LinkedIn Profile
                </a>
                <a
                  href="https://github.com/yourusername"
                  target="_blank"
                  rel="noopener noreferrer"
                  className="text-decoration-none d-flex align-items-center text-light hover-ai-text"
                >
                  <i className="fab fa-github me-3 ai-text"></i> GitHub Profile
                </a>
              </address>
              <div className="mt-4">
                <p className="text-muted">Feel free to reach out to me via email or connect on social media!</p>
              </div>
            </div>
          </div>
          <div className="col-md-6">
            <div className="ai-card p-4 h-100">
              <h3 className="h4 fw-bold mb-4 ai-text">Send a Message</h3>
              <form onSubmit={handleSubmit} className="row g-3 needs-validation" noValidate>
                <div className="col-12">
                  <label htmlFor="name" className="form-label text-light">Name</label>
                  <input
                    type="text"
                    className="form-control ai-input"
                    id="name"
                    name="name"
                    value={formData.name}
                    onChange={handleChange}
                    required
                  />
                  <div className="invalid-feedback">
                    Please enter your name.
                  </div>
                </div>
                <div className="col-12">
                  <label htmlFor="email" className="form-label text-light">Email</label>
                  <input
                    type="email"
                    className="form-control ai-input"
                    id="email"
                    name="email"
                    value={formData.email}
                    onChange={handleChange}
                    required
                  />
                  <div className="invalid-feedback">
                    Please enter a valid email address.
                  </div>
                </div>
                <div className="col-12">
                  <label htmlFor="message" className="form-label text-light">Message</label>
                  <textarea
                    className="form-control ai-input"
                    id="message"
                    name="message"
                    value={formData.message}
                    onChange={handleChange}
                    rows="5"
                    required
                  ></textarea>
                  <div className="invalid-feedback">
                    Please enter your message.
                  </div>
                </div>
                <div className="col-12 mt-4">
                  <button type="submit" className="ai-button w-100" disabled={submissionStatus === 'submitting'}>
                    {submissionStatus === 'submitting' ? (
                      <span className="spinner-border spinner-border-sm me-2" role="status" aria-hidden="true"></span>
                    ) : (
                      <i className="fas fa-paper-plane me-2"></i>
                    )}
                    {submissionStatus === 'submitting' ? 'Sending...' : 'Send Message'}
                  </button>
                </div>
                {submissionStatus === 'success' && (
                  <div className="col-12 mt-3 animate__animated animate__fadeIn">
                    <div className="ai-card alert alert-success border-success text-success bg-transparent" role="alert">
                      Message sent successfully! <i className="fas fa-check-circle ms-2"></i>
                    </div>
                  </div>
                )}
                {submissionStatus === 'error' && (
                  <div className="col-12 mt-3 animate__animated animate__fadeIn">
                    <div className="ai-card alert alert-danger border-danger text-danger bg-transparent" role="alert">
                      Failed to send message. Please try again later. <i className="fas fa-exclamation-triangle ms-2"></i>
                    </div>
                  </div>
                )}
              </form>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
};

export default Contact; 