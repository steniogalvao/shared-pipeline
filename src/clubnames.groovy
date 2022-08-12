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
    
    def getLenght(){    
        a=new clubnames().getRandom().lenght()
        println(a)
    }

}


