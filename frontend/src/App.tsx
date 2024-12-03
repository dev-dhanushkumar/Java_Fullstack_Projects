// import React from 'react';
import './App.css';
import {  CssBaseline, ThemeProvider } from '@mui/material';
// import AddShoppingCartIcon from '@mui/icons-material/AddShoppingCart';
import Navbar from './customer/components/Navbar/Navbar';
import customeTheme from './Theme/customeTheme';
import Home from './customer/pages/Home/Home';

function App() {
  return (
      <ThemeProvider theme={customeTheme} >
        <CssBaseline />
        <div>
        <Navbar/>
        <Home />
        </div>
      </ThemeProvider>
  );
}

export default App;
