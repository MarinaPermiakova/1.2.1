fun main() {
    val amount = 1_500_000
    val commissionInPercent = 0.0075
    val minCommission = 3_500
    val commission = (amount * commissionInPercent).toInt()
    val result = if (commission > minCommission) commission else minCommission
    println("Total commission: $result kop.")
}