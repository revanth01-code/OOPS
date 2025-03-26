#include <stdio.h>
#define DAYS_IN_WEEK 7
int main() {
    // Declare an array to store temperatures for each day of the week
    float temperatures[DAYS_IN_WEEK];

    // Input temperatures for each day
    printf("Enter temperatures for each day of the week:\n");
    for (int i = 0; i < DAYS_IN_WEEK; ++i) {
        printf("Day %d: ", i + 1);
        scanf("%f", &temperatures[i]);
    }
    // Display the recorded temperatures
    printf("\nRecorded temperatures for the week:\n");
    for (int i = 0; i < DAYS_IN_WEEK; ++i) {
        printf("Day %d: %.2f\n", i + 1, temperatures[i]);
    }
    // Calculate and display the average temperature
    float totalTemperature = 0;
    for (int i = 0; i < DAYS_IN_WEEK; ++i) {
        totalTemperature += temperatures[i];
    }
    float averageTemperature = totalTemperature / DAYS_IN_WEEK;
    printf("\nAverage temperature for the week: %.2f\n", averageTemperature);
    return 0;
}

