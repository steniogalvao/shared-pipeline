class clubnames {

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


//a=new clubnames().getRandom()
//println(a)
