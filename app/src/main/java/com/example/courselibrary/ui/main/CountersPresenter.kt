package com.example.courselibrary.ui.main

import com.example.courselibrary.R


class CountersPresenter(private val view: MainView)  {

  private val model = CountersModel()

      fun onCounterClick(id: Int){
          when(id){
              R.id.buttonBoomOne ->{
                val newValue = model.next(0)
                  view.setText(newValue.toString(),0)
              }
              R.id.buttonBoomSecond ->{
                  val newValue = model.next(1)
                  view.setText(newValue.toString(),1)
              }
              R.id.buttonBoomThird ->{
                  val newValue = model.next(2)
                  view.setText(newValue.toString(),2)
              }

          }
      }

}