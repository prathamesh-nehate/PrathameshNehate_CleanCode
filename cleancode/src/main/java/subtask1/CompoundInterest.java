package subtask1;

class CompoundInterest implements Interest {

    Double compoundInterest;
    
    CompoundInterest(){
        compoundInterest = 0d;
    }
    @Override
    public Double calculateInterest(Double rateOfInterest, Integer principalAmount, Double periodOfInterest) {
        compoundInterest = principalAmount * Math.pow((1 + rateOfInterest/100),periodOfInterest);
        return principalAmount - compoundInterest;
    }
}