# My Personal Portfolio

This repository contains the code for my personal portfolio website.

## Project Structure

- `frontend/`: React application (built with Vite)
- `backend/`: Spring Boot REST API

## Features

- Dynamic content for About, Skills, Projects, and Certifications.
- Contact form submission to the backend.
- Responsive design.

## Technologies Used

**Frontend:**
- React.js
- Vite
- Bootstrap
- CSS

**Backend:**
- Java
- Spring Boot
- RESTful APIs

## Setup and Run Locally

### Prerequisites
- Node.js (for frontend)
- Java Development Kit (JDK) 21 (for backend)
- Maven (for backend)

### Frontend
1. Navigate to the `frontend` directory:
   ```bash
   cd frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the development server:
   ```bash
   npm run dev
   ```
   The frontend will typically run on `http://localhost:3001`.

### Backend
1. Navigate to the `backend` directory:
   ```bash
   cd backend
   ```
2. Run the Spring Boot application using Maven:
   ```bash
   mvn spring-boot:run
   ```
   The backend API will typically run on `http://localhost:8080`.

## Deployment

This project is set up for deployment on Render, with the frontend as a Static Site and the backend as a Web Service. 