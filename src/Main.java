//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Easy easy = new Easy();
        easy.filterEvenFromTheList();
        easy.findFirstNumberGreaterThan10();
        easy.findSumOfAllNumbers();
        easy.findSumOfEvenNumbersInAlist();
        easy.squareEvenNumbersFromTheList();
        easy.sumOfEvenNumbersInAlLst();

        Easy2 easy2 = new Easy2();
        easy2.findTheSecondHighestNumberInAList();
        easy2.findFirstNonEmptyStringInAList();
        easy2.findAverageOfAllNumbersInAList();
        easy2.checkIfAllTheElementsArePositiveNumbers();
        easy2.commaSeparatedJoining();
        easy2.countStringStartingWithA();
        easy2.checkIfAnyNumberIsDivisibleBy3();
        easy2.flattenTheListOfList();
        easy2.sortInDescending();
        easy2.sortInAscending();
        easy2.findAllDistinctElementsFromList();

        Intermediate inter = new Intermediate();
        inter.calculateTheAverageAgeOfListOfPersonUsingStream();
        inter.countingOccurrencesOfEachCharacterInAStream();
        inter.sortListOfEmployeesBySalary();
        inter.partitionNumberInEvenAndOddList();
        inter.groupEmployeeByNameAndCalculateAveragrSalary();
    }
}