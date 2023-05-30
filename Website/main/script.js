
const cartUi = document.getElementById('cart-container');
const cartButton = document.querySelector('.cart');
const closeCartButton = document.querySelector('.close-cart');
// Add an event listener to the cart button
cartButton.addEventListener('click', () => {
	removeActiveClasses()

	cartUi.classList.add('show');
  });
  closeCartButton.addEventListener('click', () => {
	removeActiveClasses()
	cartUi.classList.remove('show');
  });
//_____________________________________________________________________
let cart = [];
let addToCartButtons = document.querySelectorAll('.add-to-cart-btn');
addToCartButtons.forEach(button => {
  button.addEventListener('click', function() {
    // Get the title and price of the item
    let title = button.parentNode.querySelector('h3').textContent;
    let price = button.parentNode.querySelector('p').textContent;
    // Add the item to the cart array
    cart.push({title: title, price: price});
    // Update the cart icon with the number of items in the cart
    let cartIcon = document.querySelector('.cart');
    cartIcon.dataset.count = cart.length;
    cartIcon.classList.add('has-items');
  });
});
//___________________________________________________________________
const panels = document.querySelectorAll('.panel')

panels.forEach((panel)=> {
	panel.addEventListener('click', ()=>{
		removeActiveClasses()
		panel.classList.add('active')
	})
})

function removeActiveClasses(){
	panels.forEach(panel=>{
		panel.classList.remove('active')
	})
}



