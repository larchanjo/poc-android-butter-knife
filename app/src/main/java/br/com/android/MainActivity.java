package br.com.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends Activity {

  @BindView(R.id.button)
  public Button button;

  @BindString(R.string.buttonText)
  public String buttonText;

  @BindColor(R.color.colorAccent)
  public int buttonColor;

  private Unbinder unbinder;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    unbinder = ButterKnife.bind(this);
    setUpComponenets();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    unbinder.unbind();
  }

  private void setUpComponenets() {
    button.setTextColor(buttonColor);
    button.setText(buttonText);
  }

}