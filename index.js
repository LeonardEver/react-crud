import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import {
  createBrowserRouter,
  RouterProvider,
} from "react-router-dom";
import Root from "./routes/root";
import Vehicles from "./pages/vehicles";
import Companies from "./pages/clients";
import AddVehicle from './pages/vehicles/AddVehicle'
import AddClient from './pages/clients/AddClient';


const router = createBrowserRouter([
  {
    path: "/",
    element: <Root />,
    children: [
      {
        path: "vehicles",
        element: <Vehicles />,
      },
    
      {
        path: "companies",
        element: <Companies />,
      },

      {
        path: "add-vehicle",
        element: <AddVehicle />,
      },

      {
        path: "add-client",
        element: <AddClient />,
      },
    ],
  },



]);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);
