// import React from 'react';
import './App.css';
import {  CssBaseline, ThemeProvider } from '@mui/material';
// import AddShoppingCartIcon from '@mui/icons-material/AddShoppingCart';
import Navbar from './customer/components/Navbar/Navbar';
import customeTheme from './Theme/customeTheme';
// import Home from './customer/pages/Home/Home';
// import Product from './customer/pages/Product/Product';
import ProductDetails from './customer/pages/Prodduct Details/ProductDetails';
import Review from './customer/pages/Review/Review';
import Cart from './customer/pages/Cart/Cart';

function App() {
  return (
      <ThemeProvider theme={customeTheme} >
        <CssBaseline />
        <div>
        <Navbar/>
        {/* <Home /> */}
        {/* <Product /> */}
        {/* <ProductDetails /> */}
        {/* <Review /> */}
        <Cart />
        </div>
      </ThemeProvider>
  );
}

export default App;
