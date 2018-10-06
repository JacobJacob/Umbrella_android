package org.secfirst.umbrella.whitelabel.feature.checklist.presenter

import org.secfirst.umbrella.whitelabel.data.database.difficulty.Difficulty
import org.secfirst.umbrella.whitelabel.feature.base.presenter.BasePresenterImp
import org.secfirst.umbrella.whitelabel.feature.checklist.view.ChecklistView
import org.secfirst.umbrella.whitelabel.feature.checklist.interactor.ChecklistBaseInteractor
import javax.inject.Inject

class ChecklistPresenterImp<V : ChecklistView, I :
ChecklistBaseInteractor> @Inject constructor(interactor: I) :
        BasePresenterImp<V, I>(interactor = interactor), ChecklistBasePresenter<V, I> {

    override fun submitLoadChecklist(selectDifficulty: Difficulty) {

    }

}