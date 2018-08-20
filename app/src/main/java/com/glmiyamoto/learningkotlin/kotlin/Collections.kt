package com.glmiyamoto.learningkotlin.kotlin

class Collections {
    fun test() {
        val list = listOf(
                Test(0, "Test 0"),
                Test(1, "Test 1"),
                Test(2, "Test 2"),
                Test(3, "Test 3"),
                Test(4, "Test 4"),
                Test(5, "Test 5")
        )

        val first = list.firstOrNull { it.id in 3..5 }

        val last = list.lastOrNull { it.id in 3..5 }

        val even = list.filter { it.id % 2 == 0 }

        val listId = list.map { it.id }

        val filterNotNull = list.filterNotNull()
        val groupBy = list.groupBy { it.id }
        val distinctBy = list.distinctBy { it.name }
        val sortedBy = list.sortedBy { it.id }
        val sumBy = list.sumBy { it.id }
        val maxBy = list.maxBy { it.id }
        val minBy = list.minBy { it.id }

        val empty = list.isEmpty() || list.isNotEmpty()

        list.forEach { it.name += " ${it.id}" }
    }

    inner class Test(val id: Int, var name: String)
}