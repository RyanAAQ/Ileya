user_items = []
items = []
price = []
total = []

print("=============== WELCOME TO RYAN'S SUPERMARKET ================")


customer = input("Enter customer name: ")

while True:

    product_name = input("Enter product name: ")
    user_items.append(product_name)
    
    item_price = float(input("Enter Item Price: "))
    price.append(item_price)
    
    quantity = int(input("Enter quantity: "))
    items.append(quantity)

    item_total = item_price * quantity
    total.append(item_total)

    choice = input("Add more items? (yes/no): ").strip().lower()
    if choice == "no":
        break

total_price = sum( total)
discount = total_price * 0.10
vat = total_price * 0.075
bill_total = total_price - discount + vat

print("\n===== RECEIPT =====")
print(f"Customer name: {customer}")

for i in range(len(user_items)):
    print(f"{user_items[i]} x{ items[i]} @ { price[i]:.2f} = { total[i]:.2f}")

print("-------------------------")
print(f"totalPrice: {total_price:.2f}")
print(f"Discount (10%): {discount:.2f}")
print(f"VAT (7.5%): {vat:.2f}")
print(f"Bill Total: {bill_total:.2f}")

paid = float(input("Amount Paid: "))
balance = paid - bill_total
if balance < 0:
    print(f"You owe: {balance:.2f}")
    print("==================")
    print("    THANK YOU")

else:
    print(f"Balance: {balance:.2f}")
    print("==================")
    print("    THANK YOU")

