// import React from 'react';
import './App.css';
import {  CssBaseline, ThemeProvider } from '@mui/material';
// import AddShoppingCartIcon from '@mui/icons-material/AddShoppingCart';
import Navbar from './customer/components/Navbar/Navbar';
import customeTheme from './Theme/customeTheme';
// import Home from './customer/pages/Home/Home';
// import Product from './customer/pages/Product/Product';
import ProductDetails from './customer/pages/Prodduct Details/ProductDetails';

function App() {
  return (
      <ThemeProvider theme={customeTheme} >
        <CssBaseline />
        <div>
        <Navbar/>
        {/* <Home /> */}
        {/* <Product /> */}
        <ProductDetails />
        </div>
      </ThemeProvider>
  );
}

export default App;
