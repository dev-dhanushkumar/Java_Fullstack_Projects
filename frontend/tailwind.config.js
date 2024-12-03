/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,js,tsx,ts,js,jsx}"],
  theme: {
    mode:"dark",
    extend: {
      colors: {
        "primary-color":"#00927c",
        "secondary-color":"#EAF0F1"
      }
    },
  },
  plugins: [],
}