# GAGAN2809-SPLIT-BILL-APPLICATION---JAVA---HANDS-ON

The Split Bill Application project is a simple utility tool that helps users manage and split shared expenses among multiple people. Below is an explanation of what the project does and how it can be helpful:

### **What Does This Project Do?**

1. **Add Persons to Share the Bill:**
   - The application allows users to input the names of people who will be sharing the bill. This is done using the `addPersons` method, which takes a list of names as input.

2. **Add Purposes and Amounts Spent:**
   - Users can add different purposes (like "Dinner", "Travel", etc.) along with the corresponding amounts spent for each purpose using the `addPurpose` method. This information is stored in a `HashMap` where the key is the purpose, and the value is the amount spent.

3. **Calculate the Total Amount Spent:**
   - The application calculates the total amount of money spent by summing up the amounts for all the purposes added. This is handled by the `total` method in the `TotalAmount` class.

4. **Display Amounts Spent:**
   - The `amountSpent` method in the `purposeAmount` class displays a detailed breakdown of the purposes and the corresponding amounts spent, along with the total amount.

5. **Equal Split of the Bill:**
   - The application can split the total amount equally among all the persons added using the `equalSplit` method. It calculates how much each person should pay if the bill is shared equally.

6. **Percentage-wise Split of the Bill:**
   - Users can also choose to split the bill based on custom percentages for each person using the `percen` method. The user inputs the percentage contribution of each person, and the application calculates how much each person should pay based on their specified percentage.

7. **Menu-driven Interface:**
   - The main method provides a simple menu-driven interface for users to interact with the application. Users can add persons, add purposes and amounts, check the total amount, split the bill equally, split it based on percentages, or exit the program.

### **How Helpful Is This Project?**

1. **Simplifies Bill Management:**
   - This application is useful for managing shared expenses in group activities, such as friends going out for dinner, colleagues sharing travel expenses, or roommates splitting utility bills. It automates the calculation process, saving time and reducing manual errors.

2. **Flexibility in Splitting Bills:**
   - The option to split bills equally or based on custom percentages makes the application flexible and adaptable to different scenarios. For example, if one person consumed more resources, they can be assigned a higher percentage to pay.

3. **Transparency and Fairness:**
   - By providing a clear breakdown of expenses and allowing customized splitting, the application promotes transparency and fairness among the group members. Everyone can see how much they owe and why.

4. **Learning Opportunity:**
   - For developers and students, this project serves as a good learning opportunity to understand object-oriented programming concepts, data structures like `ArrayList` and `HashMap`, and user input handling in Java.

5. **Scalable for Real-world Use Cases:**
   - While this project is a simple implementation, it can be further developed into a full-fledged application with features like storing data in databases, generating reports, integrating with payment gateways, and more.

