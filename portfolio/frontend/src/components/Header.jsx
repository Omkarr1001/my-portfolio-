import React, { useState } from 'react';

const Header = ({ toggleTheme, currentTheme }) => {

  return (
    <header className={`fixed-top ${currentTheme === 'dark' ? 'bg-black' : 'bg-light shadow'} transition-all duration-300`}>
      <nav className="navbar navbar-expand-lg">
        <div className="container">
          <a className="navbar-brand ai-text" href="#">
            <span className="fw-bold">OS</span>
          </a>
          <button
            className="navbar-toggler border-0"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarNav"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarNav">
            <ul className="navbar-nav ms-auto">
              <li className="nav-item">
                <a className="nav-link ai-text" href="#about">About</a>
              </li>
              <li className="nav-item">
                <a className="nav-link ai-text" href="#skills">Skills</a>
              </li>
              <li className="nav-item">
                <a className="nav-link ai-text" href="#projects">Projects</a>
              </li>
              <li className="nav-item">
                <a className="nav-link ai-text" href="#certifications">Certifications</a>
              </li>
              <li className="nav-item">
                <a className="nav-link ai-text" href="#contact">Contact</a>
              </li>
              <li className="nav-item ms-lg-3">
                <button className="btn ai-button" onClick={toggleTheme}>
                  <i className={currentTheme === 'dark' ? 'fas fa-sun' : 'fas fa-moon'}></i>
                </button>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </header>
  );
};

export default Header; 