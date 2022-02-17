package controllers

import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

import javax.inject.{Inject, Singleton}

@Singleton
class TodoController @Inject()(val controllerComponents: ControllerComponents)
  extends BaseController {

  def getAll(): Action[AnyContent] = Action {
    NoContent
  }
}
