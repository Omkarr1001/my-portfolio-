const API_BASE_URL = 'http://localhost:8080/api';

export const fetchAbout = async () => {
  try {
    const response = await fetch(`${API_BASE_URL}/about`);
    if (!response.ok) throw new Error('Failed to fetch about data');
    return await response.json();
  } catch (error) {
    console.error('Error fetching about data:', error);
    throw error;
  }
};

export const fetchSkills = async () => {
  try {
    const response = await fetch(`${API_BASE_URL}/skills`);
    if (!response.ok) throw new Error('Failed to fetch skills data');
    return await response.json();
  } catch (error) {
    console.error('Error fetching skills data:', error);
    throw error;
  }
};

export const fetchProjects = async () => {
  try {
    const response = await fetch(`${API_BASE_URL}/projects`);
    if (!response.ok) throw new Error('Failed to fetch projects data');
    return await response.json();
  } catch (error) {
    console.error('Error fetching projects data:', error);
    throw error;
  }
};

export const fetchCertifications = async () => {
  try {
    const response = await fetch(`${API_BASE_URL}/certifications`);
    if (!response.ok) throw new Error('Failed to fetch certifications data');
    return await response.json();
  } catch (error) {
    console.error('Error fetching certifications data:', error);
    throw error;
  }
};

export const submitContactForm = async (formData) => {
  try {
    const response = await fetch(`${API_BASE_URL}/contact`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(formData),
    });
    if (!response.ok) throw new Error('Failed to submit contact form');
    return await response.json();
  } catch (error) {
    console.error('Error submitting contact form:', error);
    throw error;
  }
}; 