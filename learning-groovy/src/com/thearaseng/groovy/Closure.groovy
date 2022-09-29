package com.thearaseng.groovy

def outsideClosure = 'Hello'

def closure = { name -> println "${outsideClosure}, ${name}" }
closure.call('Theara')

//******************************************************************
def closure2 = {
    name,question ->
    println "${outsideClosure}, ${name}. ${question}"
}

closure2.call'Theara', 'How are you?'

//******************************************************************
def callClosure(closure) {
    closure.call 'Theara', 'This closure is called in method'
}

callClosure closure2

//******************************************************************

def myList = ['Apple', 'Orange', 'Grapes']
println myList.each { it }

def myMap = [
        'subject':'groovy',
        'topic':'closure'
]
println myMap.each { it }