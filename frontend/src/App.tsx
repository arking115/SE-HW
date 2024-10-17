import React, { useState, useEffect } from 'react';

type DataItem = {
  id: number;
  value: string;
};

const App = () => {
  const [data, setData] = useState([] as DataItem[]);

  useEffect(() => {
    fetch('http://localhost:8080/hello')
      .then(response => response.json())
      .then(data => setData(data))
      .catch(error => console.error('Error fetching data:', error));
  }, []);

  return (
    <div className="flex items-center justify-center h-screen bg-black">
      <div className="text-center text-white">
        <h1 className="text-3xl font-bold mb-4">Fetched Data</h1>
        <ul className="list-none">
          {data.map((item) => (
            <li key={item.id} className="text-lg">
              {item.value}
            </li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default App;
