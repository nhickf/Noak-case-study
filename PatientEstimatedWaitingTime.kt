package com.creativegrpcx.patientqueue


data class PatientQueuing(
    val doctors: List<Doctor>
) {
    fun calculateEstimatedWaitingTime(patientPosition: Int): Int {
        // Calculate the average consultation time of all the doctors
        val averageConsultationTime = doctors.map { it.consultationMinutes }.average()

        // Calculate the estimated waiting time based on the patient's position
        val estimatedWaitingTime = (patientPosition - 1) * averageConsultationTime

        return estimatedWaitingTime.toInt()
    }
}
