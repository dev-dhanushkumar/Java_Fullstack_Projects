import React from 'react'
import DealCard from './DealCard'
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";
import Slider from "react-slick";

const Deal = () => {
  const settings = {
    dots: true,
    infinite: true,
    speed: 500,
    slidesToShow: 3,
    slidesToScroll: 3
  };

  return (
    <div className='py-5 lg:px-20'>
        <div className='flex items-center justify-between'>
        <Slider {...settings}>
        </Slider>
          {[1,1,1,1,1,1].map((item) => <DealCard />)}
        </div>
    </div>
  )
}

export default Deal