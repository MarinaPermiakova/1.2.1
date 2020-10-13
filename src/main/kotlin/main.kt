fun main() {
    val amountRub = 10000.50
    val amountKop = (amountRub * 100).toInt()
    val commissionInPercent = 0.0075
    val maxCommission = 3500
    val commission = (amountKop * commissionInPercent).toInt()
    val result = if (commission > maxCommission) maxCommission/100.0 else commission/100.0
    println("Total commission: $result rub.")
}