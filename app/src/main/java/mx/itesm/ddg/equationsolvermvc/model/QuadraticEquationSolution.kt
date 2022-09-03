package mx.itesm.ddg.equationsolvermvc.model

/**
 * Author: David Damian
 * QuadraticEquationSolution holds the two different solutions for a quadratic equation, or
 * null if there are no solutions.
 */

data class QuadraticEquationSolution(val solution1: Complex?, val solution2: Complex?) {
}