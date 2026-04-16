@Model(usages = @Usage("${__REQUEST_PARAMETERS}"),
  description = "Defines Request Parameters",
  descriptionKey = "tags.models.requestParameters.description"
)
public class SomeClass extends IModel {
   //....
  @Override
  public String getModelName() {
     return "__REQUEST_PARAMETERS";
  }
}