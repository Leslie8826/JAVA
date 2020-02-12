This program simulates the creation of the staff of a company.
<br><br> First we create a class of employees with all the needed information: name, salary, salary index, value to compute the salary. We also create methods to get access to some information.
<br> The salary of each employee is calculated as: salary = salary_index * value. Each employee has their own salary index.
<br><br> Second, we create a class of managers that inherites the properties and methods of the employee class. In this class, we create a method to display all employees a manager is responsibe for.
With no precise direction, we simply assume that all managers have certain id numbers and a certain number of employee around that id number are managed. 
<br> All managers have an id that is a multiple of 10 and all 9 employees before that id multiple of 10 are managed.
<br> Example: A company has 10 employees with the following ids: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10. The assumption we follow is that employee with id=10 is a manager and employees with ids=1,2,...,8, 9 are all managed by manager of id=10.
<br><br> Also, we create a class of sales employees that inherites the properties and methods of the employee class. In this class, we create a method to set the sales resutls they did in a month and another method to calculate their salary which is: (base + bonus) * this.salary_index.
<br><br> Finally, we create a class for all the staff of the company with methods to display the information of all staff members and the sum of all salaries combined.

