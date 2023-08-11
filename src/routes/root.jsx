import { Outlet, Link } from "react-router-dom";
import Banner from '../components/banner/index';
import '../routes/root.css'


export default function Root() {
    return (
      <>
        <Banner />
        <div id="sidebar">
          <nav>
            <ul className="NavigatePos">
              <li className="NavigateVeic">
                <Link to={'vehicles'} className="TxtBt1">Seus veiculos</Link>
              </li>
              <li className="NavigateComp">
                <Link to={'companies'} className="TxtBt2">Estabelecimentos</Link>
              </li>
            </ul>
          </nav>
        </div>
        <div id="detail">
            <Outlet />
        </div>
      </>
    );
  }