# Multivendor-Ecommerce API Documentation

--- 

## API Overview
The E-commerce Multi-Vendor API facilitates a complete marketplace experience, supporting customers, sellers, and administrators with dedicated features for each role. This API is built to allow smooth and secure interactions across the platform, including product management 🚀, user authentication 🔐, order tracking 🚚, and payment processing 💲. It uses JWT 🪙 (JSON Web Token) for authentication, ensuring secure access control across all endpoints.

--- 

## Key Functionality
1. Authentication & Authorization

    - Provides secure authentication for customers, sellers, and admins.
    - Uses JWT for access control, requiring a valid token for most operations.
2. Customer Features

    - Product Browsing: Customers can view, filter, and sort products.
    - Cart & Checkout: Manage shopping cart, apply coupons, add addresses, and complete purchases.
    - Order Tracking: View and manage order history, including details and statuses.

3. Seller Features

    - Product Management: Sellers can add, update, and manage their product listings.
    - Order Management: View and process customer orders, track payments, and monitor sales.
    - Dashboard Analytics: Access sales and earnings insights for data-driven decisions

4. Admin Features

    - User Management: Admins can approve or suspend seller accounts and manage customer information.
    - Content & Promotions: Set up and manage coupons, promotional deals, and homepage content.
    - Platform Statistics: View and analyze platform-wide statistics on sales, transactions, and user engagement.

--- 

## API Structure
The API is organized by user role and includes endpoints for various functionalities:

- Authentication: /api/auth/*
- Customer Operations: /api/customer/*
- Seller Operations: /api/seller/*
- Admin Operations: /api/admin/*
- Product Operation: /products/*

### Authentication
- **Login**
    - Endpoint: `/api/auth/signin`
    - Method: **POST**
    - Description: Authenticates a user and returns a JWT token.
    - Request
        ```json
        {
            "email":"sample@gmail.com",
            "otp":"123456"
        }
        ```
- **Register**
    - Endpoint: `/api/auth/register`
    - Method: **POST**
    - Description: Registers a new user.
    - Request
        ```json
        {
            "email":"sample@gmail.com",
            "fullName":"dummy",
            "otp":"361754",
            "mobile":"1234567890"
        }
        ```

- **Send OTP**
    - Endpoint: `/auth/send/login-signup-otp`
    - Method: **POST**
    - Description: Sends OTP to user's  email id.
    - Request
        ```json
        {
            "email":"sample1@gmail.com",
            "role":"ROLE_CUSTOMER"
        }
        ```

### Customer Endpoints

- **Product List**
    - Endpoint: `/products`
    - Method: **GET**
    - Description: Retrieves a paginated list of products with optional filters (category, price, etc.).
    - Query Parameters: category, price, sort

- **Product Details**

    - Endpoint: `/products/{productId}`
    - Method: **GET**
    - Description: Retrieves details of a specific product.
    
- **Add to Cart**

    - Endpoint: `/api/cart/add`
    - Method: **PUT**
    - Description: Adds an item to the user’s cart.
    - Request
        ```json
        {
            "size": "S",
            "quantity": 3,
            "productId": 102
        }
        ```

- **Apply Coupon**

    - Endpoint: `/api/coupons/apply?apply=true`
    - Method: **POST**
    - Description: Applies a discount coupon to the cart.
    
