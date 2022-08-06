class SomeClass {

    def names =[
            "Arsenal",
            "Chelsea",
            "Manchester United",
            "Brentford"
    ]

    def getRandom() {

        3.times {
            Collections.shuffle names
        }
        return  names.first()
    }

}


//a=new SomeClass().getRandom()
//println(a)
