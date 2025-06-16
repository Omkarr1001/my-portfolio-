import { useState, useEffect } from 'react';
import Header from './components/Header';
import About from './components/About';
import Projects from './components/Projects';
import Skills from './components/Skills';
import Certifications from './components/Certifications';
import Contact from './components/Contact';
import './App.css';

function App() {
  const [theme, setTheme] = useState('dark'); // 'dark' or 'light'
  const [isVisible, setIsVisible] = useState({});

  useEffect(() => {
    // Apply theme class to body
    document.body.className = `${theme}-theme`;

    // Initialize typed.js for the title
    if (window.Typed) {
      new window.Typed('#typed-title', {
        strings: ['Full Stack Developer', 'AI Enthusiast', 'Problem Solver'],
        typeSpeed: 50,
        backSpeed: 30,
        backDelay: 2000,
        loop: true
      });
    }

    // Intersection Observer for section animations
    const observer = new IntersectionObserver(
      (entries) => {
        entries.forEach((entry) => {
          if (entry.isIntersecting) {
            setIsVisible((prev) => ({ ...prev, [entry.target.id]: true }));
          }
        });
      },
      { threshold: 0.1 }
    );

    document.querySelectorAll('section').forEach((section) => {
      observer.observe(section);
    });

    return () => observer.disconnect();
  }, [theme]); // Re-run effect when theme changes

  const toggleTheme = () => {
    setTheme((prevTheme) => (prevTheme === 'dark' ? 'light' : 'dark'));
  };

  return (
    <div className="app">
      <Header toggleTheme={toggleTheme} currentTheme={theme} />
      <main>
        <section className="hero-section d-flex align-items-center justify-content-center">
          <div className="container text-center">
            <h1 className="display-3 fw-bold mb-3">
              <span className="ai-text">Omkar Salunkhe</span>
            </h1>
            <p className="lead mb-4">
              <span id="typed-title" className="typing-text"></span>
            </p>
            <div className="d-flex justify-content-center gap-3">
              <a href="#about" className="ai-button">
                Learn More
              </a>
              <a href="#contact" className="ai-button">
                Contact Me
              </a>
            </div>
            <div className="mt-5">
              <a href="#about" className="text-light text-decoration-none">
                <i className="fas fa-chevron-down fa-bounce"></i>
              </a>
            </div>
          </div>
        </section>
        <section id="about" className={`section-transition ${isVisible['about'] ? 'visible' : ''}`}>
          <About />
        </section>
        <section id="skills" className={`section-transition ${isVisible['skills'] ? 'visible' : ''}`}>
          <Skills />
        </section>
        <section id="projects" className={`section-transition ${isVisible['projects'] ? 'visible' : ''}`}>
          <Projects />
        </section>
        <section id="certifications" className={`section-transition ${isVisible['certifications'] ? 'visible' : ''}`}>
          <Certifications />
        </section>
        <section id="contact" className={`section-transition ${isVisible['contact'] ? 'visible' : ''}`}>
          <Contact />
        </section>
      </main>
      <footer className="bg-black text-secondary py-4">
        <div className="container">
          <div className="row">
            <div className="col-md-4 mb-3">
              <h3 className="text-danger mb-2">Omkar Salunkhe</h3>
              <p className="text-secondary small">
                Full Stack Developer passionate about creating efficient and user-friendly applications.
              </p>
            </div>
            <div className="col-md-4 mb-3">
              <h3 className="text-danger mb-2">Quick Links</h3>
              <ul className="list-unstyled small">
                <li><a href="#about" className="text-secondary text-decoration-none hover-danger">About</a></li>
                <li><a href="#projects" className="text-secondary text-decoration-none hover-danger">Projects</a></li>
                <li><a href="#skills" className="text-secondary text-decoration-none hover-danger">Skills</a></li>
                <li><a href="#certifications" className="text-secondary text-decoration-none hover-danger">Certifications</a></li>
                <li><a href="#contact" className="text-secondary text-decoration-none hover-danger">Contact</a></li>
              </ul>
            </div>
            <div className="col-md-4 mb-3">
              <h3 className="text-danger mb-2">Connect</h3>
              <div className="d-flex gap-3 fs-4">
                <a href="https://github.com/yourusername" target="_blank" rel="noopener noreferrer" className="text-danger hover-light">
                  <i className="bi bi-github"></i>
                </a>
                <a href="https://linkedin.com/in/yourusername" target="_blank" rel="noopener noreferrer" className="text-danger hover-light">
                  <i className="bi bi-linkedin"></i>
                </a>
                <a href="mailto:your.email@example.com" className="text-danger hover-light">
                  <i className="bi bi-envelope"></i>
                </a>
              </div>
            </div>
          </div>
          <div className="text-center text-secondary small mt-3 pt-3 border-top border-secondary-subtle">
            <p>&copy; {new Date().getFullYear()} Omkar Salunkhe. All rights reserved.</p>
          </div>
        </div>
      </footer>
    </div>
  );
}

export default App; 