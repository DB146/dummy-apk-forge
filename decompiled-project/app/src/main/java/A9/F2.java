package A9;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.kt.apps.core.base.leanback.SearchBar;
import com.kt.apps.core.base.leanback.SearchEditText;
import com.kt.apps.core.base.leanback.SpeechOrbView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* loaded from: classes2.dex */
public final class F2 implements RecognitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchBar f823a;

    public F2(SearchBar searchBar) {
        this.f823a = searchBar;
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i7) {
        switch (i7) {
            case 1:
                int i10 = SearchBar.L;
                Log.w("SearchBar", "recognizer network timeout");
                break;
            case 2:
                int i11 = SearchBar.L;
                Log.w("SearchBar", "recognizer network error");
                break;
            case 3:
                int i12 = SearchBar.L;
                Log.w("SearchBar", "recognizer audio error");
                break;
            case 4:
                int i13 = SearchBar.L;
                Log.w("SearchBar", "recognizer server error");
                break;
            case 5:
                int i14 = SearchBar.L;
                Log.w("SearchBar", "recognizer client error");
                break;
            case 6:
                int i15 = SearchBar.L;
                Log.w("SearchBar", "recognizer speech timeout");
                break;
            case 7:
                int i16 = SearchBar.L;
                Log.w("SearchBar", "recognizer no match");
                break;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                int i17 = SearchBar.L;
                Log.w("SearchBar", "recognizer busy");
                break;
            case 9:
                int i18 = SearchBar.L;
                Log.w("SearchBar", "recognizer insufficient permissions");
                break;
            default:
                int i19 = SearchBar.L;
                Log.d("SearchBar", "recognizer other error");
                break;
        }
        SearchBar searchBar = this.f823a;
        searchBar.b();
        searchBar.f16031v.post(new B2(searchBar, R.raw.lb_voice_failure, 0));
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i7, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || stringArrayList.size() == 0) {
            return;
        }
        String str = stringArrayList.get(0);
        String str2 = stringArrayList.size() > 1 ? stringArrayList.get(1) : null;
        SearchEditText searchEditText = this.f823a.f16024a;
        searchEditText.getClass();
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            Matcher matcher = m3.f1283f.matcher(str2);
            while (matcher.find()) {
                int start = matcher.start() + length;
                spannableStringBuilder.setSpan(new l3(searchEditText, str2.charAt(matcher.start()), start), start, matcher.end() + length, 33);
            }
        }
        searchEditText.f1288d = Math.max(str.length(), searchEditText.f1288d);
        searchEditText.setText(new SpannedString(spannableStringBuilder));
        searchEditText.bringPointIntoView(searchEditText.length());
        ObjectAnimator objectAnimator = searchEditText.f1289e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        int streamPosition = searchEditText.getStreamPosition();
        int length2 = searchEditText.length();
        int i7 = length2 - streamPosition;
        if (i7 > 0) {
            if (searchEditText.f1289e == null) {
                ObjectAnimator objectAnimator2 = new ObjectAnimator();
                searchEditText.f1289e = objectAnimator2;
                objectAnimator2.setTarget(searchEditText);
                searchEditText.f1289e.setProperty(m3.f1284u);
            }
            searchEditText.f1289e.setIntValues(streamPosition, length2);
            searchEditText.f1289e.setDuration(i7 * 50);
            searchEditText.f1289e.start();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        SearchBar searchBar = this.f823a;
        SpeechOrbView speechOrbView = searchBar.f16025b;
        speechOrbView.setOrbColors(speechOrbView.f16096H);
        speechOrbView.setOrbIcon(speechOrbView.getResources().getDrawable(R.drawable.lb_ic_search_mic));
        speechOrbView.a(true);
        speechOrbView.f16037A = false;
        speechOrbView.b();
        View view = speechOrbView.f16045c;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        speechOrbView.f16098J = 0;
        speechOrbView.f16099K = true;
        searchBar.f16031v.post(new B2(searchBar, R.raw.lb_voice_open, 0));
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        SearchBar searchBar = this.f823a;
        if (stringArrayList != null) {
            String str = stringArrayList.get(0);
            searchBar.f16027d = str;
            searchBar.f16024a.setText(str);
            TextUtils.isEmpty(searchBar.f16027d);
        }
        searchBar.b();
        searchBar.f16031v.post(new B2(searchBar, R.raw.lb_voice_success, 0));
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f4) {
        this.f823a.f16025b.setSoundLevel(f4 < 0.0f ? 0 : (int) (f4 * 10.0f));
    }
}
