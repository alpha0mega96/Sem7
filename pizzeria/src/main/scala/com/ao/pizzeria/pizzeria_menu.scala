package com.ao.pizzeria

import org.scalatra._

class pizzeria_home extends PizzeriaStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
}

object MenuTemplate {

 	def page(title:String, content:Seq[Node], url: String => String = identity _, head: Seq[Node] = Nil, scripts: Seq[String] = Seq.empty, defaultScripts: Seq[String] = Seq.empty = {
		<!DOCTYPE html>
		<!-- Website template by freewebsitetemplates.com -->
		<head>
			<title>Shake Menu - Retro Diner</title>
			<meta charset="utf-8">
			<link href="css/style.css" rel="stylesheet" type="text/css">
		</head>
		<body>
			<div id="header">
				<div>
					<a href="index.html"><img class="logo" src="images/logo.png" width="513" height="84" alt="" title=""></a>
					<a href="index.html"><img  src="images/waitress.png" width="332" height="205" alt="" title=""></a>
					<ul class="navigation">
						<li>
							<a href="index.html">Home</a>
						</li>
						<li>
							<a href="about.html">About</a>
						</li>
						<li>
							<a class="active" href="shake.html">Menu</a>
						</li>
						<li>
							<a href="contact.html">Contact</a>
						</li>
						<li>
							<a href="blog.html">Blog</a>
						</li>
					</ul>
				</div>
			</div>
			<div id="body">
				<div class="content">
					<div>
						<div>
							<h1>Shakes</h1>
							<div> <a href="shake.html"><img src="images/shake.jpg" width="434" height="347" alt=""></a> </div>
							<ul>
								<li>
									<h2><a href="shake.html">Chocolate Vanilla</a></h2>
									<p>
										This website template has been designed by Free Website Templates for you, for free. You can replace all this text with your own text.
									</p>
									<span class="price">95&cent;</span>
								</li>
								<li>
									<h2><a href="shake.html">Strawberry Smoothie</a></h2>
									<p>
										This website template has been designed by Free Website Templates for you, for free. You can replace all this text with your own text.
									</p>
									<span class="price">80&cent;</span>
								</li>
								<li>
									<h2><a href="shake.html">Mango Banana Medley</a></h2>
									<p>
										This website template has been designed by Free Website Templates for you, for free. You can replace all this text with your own text.
									</p>
									<span class="price">$1</span>
								</li>
								<li class="last	">
									<h2><a href="shake.html">Dark Chocolate Supreme</a></h2>
									<p>
										A small burger with juicy beef patty, tomato, lettuce, bacon and cheese. Served with small fries and drink of your choice.
									</p>
									<span class="price">99&cent;</span>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="sidebar">
					<h1>Menu</h1>
					<ul class="navigation">
						<li class="first">
							<a href="burger.html">BURGERS</a>
						</li>
						<li>
							<a href="hotdog.html">HOTDOGS</a>
						</li>
						<li>
							<a class="active" href="shake.html">SHAKES</a>
						</li>
						<li>
							<a href="breakfast.html">BREAKFAST</a>
						</li>
					</ul>
					<a href="shake.html" class="download">&nbsp;</a> </div>
			</div>
			<div id="footer">
				<div>
					<ul>
						<li class="first">
							<h2>Delivery Hotline</h2>
							<h3>Call 0-123-456-789</h3>
							<ul>
								<li>
									<a href="http://www.freewebsitetemplates.com/go/facebook" class="facebook"></a>
								</li>
								<li>
									<a href="http://www.freewebsitetemplates.com/go/twitter" class="twitter"></a>
								</li>
								<li>
									<a href="http://www.freewebsitetemplates.com/go/googleplus" class="googleplus"></a>
								</li>
							</ul>
						</li>
						<li>
							<a href="index.html"><img class="logo" src="images/logo-footer.png" alt=""></a>
							<ul class="navigation">
								<li>
									<a href="index.html">Home</a>
								</li>
								<li>
									<a href="about.html">About Us</a>
								</li>
								<li>
									<a href="menu.html">Menu</a>
								</li>
								<li>
									<a href="contact.html">Contact Us</a>
								</li>
							</ul>
							<span>&copy; 2023 RetroDiner.com. All Rights Reserved</span>
						</li>
						<li class="last">
							<h2>Follow Us By Email</h2>
							<form action="index.html">
								<input type="text" name="subscribe" value="Enter Your Email Here...">
								<input type="submit" value="">
							</form>
						</li>
					</ul>
				</div>
			</div>
		</body>
		</html>
	}
}

//Need Template

/* Site Map:
	1) Home Page:
		- Contains popular offers.
	2) Menu:
		- Veg and Non-Veg pizzas. (From Smokin' Joe's website *sorry*)
		- Pricing and addons.
		- Adding any Pizza to cart magically makes Cart button active.
	3) Cart:
		- Payments made through here.. 
		- Once one reaches here, a session is made! Session only cancelled by payout or cancel.
		- Shows which branch will provide pizza order.
		- Pay option leads to bogus page saying "Let's say you Payed. Your hypothetical order will be ready in 30 minutes."
		- Allows addition and removal of pizzas.
	4) Branches:
		- Shows all branches. (No MAPS!!!)
		- Addresses and Contact number.. (Take true things, bogusify)
	5) Contact Us:
		- Put credits of you.
*/