package mx.itesm.ddg.equationsolvermvc.view

import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.itesm.ddg.equationsolvermvc.databinding.ActivityMainBinding
import mx.itesm.ddg.equationsolvermvc.model.QuadraticEquationSolution
import mx.itesm.ddg.equationsolvermvc.model.QuadraticEquationSolver
import mx.itesm.ddg.equationsolvermvc.viewmodel.EquationSolverViewModel

/**
 * Author: David Damian
 * The view for the EquationSolver.
 */

class EquationSolverView : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        registerEvents()
    }

    private fun registerEvents() {
        binding.btnSolveEquation.setOnClickListener {
            val a: Double = binding.etParameterA.text.toString().toDouble()
            val b: Double = binding.etParameterB.text.toString().toDouble()
            val c: Double = binding.etParameterC.text.toString().toDouble()

            val solution: QuadraticEquationSolution = QuadraticEquationSolver.solve(a, b, c)

            val root1: String = QuadraticEquationSolver.parseSolution(solution.solution1)
            val root2: String = QuadraticEquationSolver.parseSolution(solution.solution2)

            binding.etRoot1.setText(root1)
            binding.etRoot2.setText(root2)
        }
    }
}