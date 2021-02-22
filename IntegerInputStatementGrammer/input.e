PRINTLN "Calculate Payroll - Double Pay Overtime"
PRINT "Enter rate of pay:"
INTEGER rate, hours, overtime_hours, netpay
INPUT rate
PRINT "Enter hours up to 40:"
INPUT hours
PRINT "Enter overtime hours:"
INPUT overtime_hours
LET netpay = rate * hours + rate * overtime_hours * 2
PRINT "Your net pay = "
PRINTLN netpay
