Java - Practical Exam
Duration - 4hrs
Emissions
The given CSV provides several greenhouse gas emissions for years 2000-2007 by different industries. Legislators require different statistics to regulate emissions for better environment protection.
Therefore, create a REST web service to do the following,
1. A user should be able to enter new greenhouse gas emission statistics for any year after 2007. The sector, year, statistic (gas) and value attributes will be mandatory and if the user did not provide a unit, then it should be assumed as Tonnes.If the user enters statistics in Kilogrammes then those values should be converted to Tonnes before being saved to the database.
Bonus
3. For a given year return all sectors which emitted more than 500 Tonnes of any
greenhouse gasses.
2. For a given year return the sector with maximum emission of a greenhouse gas.
