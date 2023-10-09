@regression
@ProductsPage
Feature: My Store - Products Page

  Scenario Outline: Filtering products
    Given the user accesses the myStore main page
    When clicks on the All Products link
    Then the user is redirected to the Products Home page
    When the user checks the "<ProductType>" checkbox
    And the user checks the "<ProductType2>" checkbox
    Then the user should see "<amount>" of products available
    Examples:
      | ProductType | ProductType2  | amount                |
      | Accessories | StudioDesign  | There are 7 products. |
      | Accessories | Polyester     | There are 3 products. |
      | Art         | GraphicCorner | There are 6 products. |