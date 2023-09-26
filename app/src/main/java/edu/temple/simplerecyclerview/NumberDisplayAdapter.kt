package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (_numbers: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    private val numbers = _numbers

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NumberDisplayAdapter.NumberViewHolder {
        return NumberViewHolder(
            TextView(parent.context).apply{
                layoutParams = ViewGroup.LayoutParams(300, 600)
            }
        )
    }

    override fun onBindViewHolder(holder: NumberDisplayAdapter.NumberViewHolder, position: Int) {
        holder.textView.setText(numbers[position])
    }

    override fun getItemCount(): Int {
        return numbers.size
    }
}