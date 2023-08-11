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
import Companies from "./pages/companies";
import AddVehicle from './pages/vehicles/AddVehicle'
import AddCompany from './pages/companies/AddCompany';


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
        path: "add-company",
        element: <AddCompany />,
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
