"use client";
import { useState } from "react";

function App() {
  const [message, setMessage] = useState("");
  const [user, setUser] = useState([]);

  const handleClick = () => {
    fetch("http://localhost:8080/hej")
      .then((response) => response.text())
      .then((data) => setMessage(data))
      .catch((err) => console.error("NEJ"));
  };

  const showUsers = () => {
    fetch("http://localhost:8080/user")
      .then((response) => response.json())
      .then((data) => setUser(data))
      .catch((err) => console.error("Kunde inte hitta användare"));
  };

  return (
    <div>
      <h1>Testar om Backend och Frontend flödet funkar</h1>
      <button onClick={handleClick}>Hämta hej</button>
      <p>{message}</p>

      <button onClick={showUsers}>Get users</button>
      <ul>
        {user.map((user, index) => (
          <li key={index}>
            {user.userFirstName} {user.userLastName} - {user.userEmail}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;