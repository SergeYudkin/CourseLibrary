package com.example.courselibrary.ui.main

import com.example.courselibrary.R


class CountersPresenter(private val view: MainView)  {

  private val model = CountersModel()



      fun onCounterClick(id: Int){

          when(id){
              0 ->{
                  view.setText((model.next(id)).toString(),id)
              }
              1 ->{
                  view.setText((model.next(id)).toString(),id)
              }
             2 ->{
                 view.setText((model.next(id)).toString(),id)

              }

          }
      }





}