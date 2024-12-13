import React, { useEffect, useState } from 'react'
import './ProductCard.css';
import { Button } from '@mui/material';
import { Favorite, ModeComment } from '@mui/icons-material';
import { teal } from '@mui/material/colors';

const images = [
  "https://rukminim2.flixcart.com/image/612/612/xif0q/t-shirt/r/5/v/l-hlts004388-highlander-original-imahyycwmfqkfssn.jpeg?q=70",
  "https://rukminim2.flixcart.com/image/612/612/xif0q/t-shirt/i/6/m/l-hlts004388-highlander-original-imahyycwkfnq3rbd.jpeg?q=70",
  "https://rukminim2.flixcart.com/image/612/612/xif0q/t-shirt/6/c/2/l-hlts004388-highlander-original-imahyycw7x5mgvyn.jpeg?q=70",
  "https://rukminim2.flixcart.com/image/612/612/xif0q/t-shirt/e/j/l/l-hlts004388-highlander-original-imahyycwswypuah2.jpeg?q=70"
]
const ProductCard = () => {

  const [currentImage, setCurrentImage] = useState(0);
  const [isHovered, setIsHovered] = useState(false);

  useEffect(() => {
    let interval:any;
    if(isHovered) {
      interval = setInterval(() => {
        setCurrentImage((prevImage) => (prevImage + 1) % images.length);
      }, 1000);
    } else {
      clearInterval(interval)
      // setCurrentImage(0);
      interval = null
    }

    return () => clearInterval(interval);
  },[isHovered])

  return (
    <>
      <div className='group px-4 relative'>

        <div className='card'
        onMouseEnter={() => setIsHovered(true)}
        onMouseLeave={() => setIsHovered(false)}
        >

          {images.map((item, index) => <img
          className='card-media object-top'
          src={item} alt=""
          style={{transform:`translateX(${(index - currentImage) * 100}%)`}}
          />
          )}

          {isHovered &&
            <div className='indicator flex flex-col items-center space-y-2'>
              <div className='flex gap-3'>
                <Button variant='contained' color='secondary'>
                  <Favorite sx={{color:teal[500]}}/>
                </Button>
                <Button variant='contained' color='secondary'>
                  <ModeComment sx={{color:teal[500]}}/>
                </Button>
              </div>
            </div>
          }
          
        </div>

        <div className='details pt-3 space-y-1 group-hover-effect rounded-md'>
          <div className='name'>
            <h1>HIGHLANDER</h1>
            <p>Men Printed Round Neck Cotton Blend Blue T-Shirt</p>
          </div>

          <div className='flex items-center gap-3'>
            <span className='font-semibold text-gray-800'>
              ₹ 498
            </span>
            <span className='thin-line-through text-gray-400'>
              ₹ 1649
            </span>
            <span className='text-primary-color font-semibold'>
              69%
            </span>
          </div>

        </div>

      </div>
    </>
  )
}

export default ProductCard