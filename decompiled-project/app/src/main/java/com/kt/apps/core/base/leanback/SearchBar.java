package com.kt.apps.core.base.leanback;

import A9.C2;
import A9.D2;
import A9.E2;
import A9.F2;
import A9.G2;
import A9.H2;
import A9.K2;
import A9.Q0;
import A9.S0;
import A9.T;
import A9.h3;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public class SearchBar extends RelativeLayout {
    public static final /* synthetic */ int L = 0;

    /* renamed from: A, reason: collision with root package name */
    public final int f16013A;

    /* renamed from: B, reason: collision with root package name */
    public final int f16014B;

    /* renamed from: C, reason: collision with root package name */
    public final int f16015C;

    /* renamed from: D, reason: collision with root package name */
    public final int f16016D;

    /* renamed from: E, reason: collision with root package name */
    public final int f16017E;

    /* renamed from: F, reason: collision with root package name */
    public SpeechRecognizer f16018F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f16019G;

    /* renamed from: H, reason: collision with root package name */
    public SoundPool f16020H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f16021I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f16022J;

    /* renamed from: K, reason: collision with root package name */
    public final Context f16023K;

    /* renamed from: a, reason: collision with root package name */
    public SearchEditText f16024a;

    /* renamed from: b, reason: collision with root package name */
    public SpeechOrbView f16025b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f16026c;

    /* renamed from: d, reason: collision with root package name */
    public String f16027d;

    /* renamed from: e, reason: collision with root package name */
    public String f16028e;

    /* renamed from: f, reason: collision with root package name */
    public String f16029f;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f16030u;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f16031v;

    /* renamed from: w, reason: collision with root package name */
    public final InputMethodManager f16032w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16033x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f16034y;

    /* renamed from: z, reason: collision with root package name */
    public final int f16035z;

    public SearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f16031v = new Handler();
        this.f16033x = false;
        this.f16021I = new SparseIntArray();
        this.f16022J = false;
        this.f16023K = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(R.layout.lb_search_bar, (ViewGroup) this, true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.lb_search_bar_height));
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.f16027d = "";
        this.f16032w = (InputMethodManager) context.getSystemService("input_method");
        this.f16013A = resources.getColor(R.color.lb_search_bar_text_speech_mode);
        this.f16035z = resources.getColor(R.color.lb_search_bar_text);
        this.f16017E = resources.getInteger(R.integer.lb_search_bar_speech_mode_background_alpha);
        this.f16016D = resources.getInteger(R.integer.lb_search_bar_text_mode_background_alpha);
        this.f16015C = resources.getColor(R.color.lb_search_bar_hint_speech_mode);
        this.f16014B = resources.getColor(R.color.lb_search_bar_hint);
    }

    public final void a() {
        if (this.f16022J) {
            return;
        }
        if (!hasFocus()) {
            requestFocus();
        }
        if (this.f16018F == null) {
            return;
        }
        if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            throw new IllegalStateException("android.permission.RECORD_AUDIO required for search");
        }
        this.f16022J = true;
        this.f16024a.setText("");
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        this.f16018F.setRecognitionListener(new F2(this));
        this.f16019G = true;
        this.f16018F.startListening(intent);
    }

    public final void b() {
        if (this.f16022J) {
            this.f16024a.setText(this.f16027d);
            this.f16024a.setHint(this.f16028e);
            this.f16022J = false;
            if (this.f16018F == null) {
                return;
            }
            this.f16025b.c();
            if (this.f16019G) {
                this.f16018F.cancel();
                this.f16019G = false;
            }
            this.f16018F.setRecognitionListener(null);
        }
    }

    public final void c() {
        String string = getResources().getString(R.string.lb_search_bar_hint);
        if (!TextUtils.isEmpty(this.f16029f)) {
            string = this.f16025b.isFocused() ? getResources().getString(R.string.lb_search_bar_hint_with_title_speech, this.f16029f) : getResources().getString(R.string.lb_search_bar_hint_with_title, this.f16029f);
        } else if (this.f16025b.isFocused()) {
            string = getResources().getString(R.string.lb_search_bar_hint_speech);
        }
        this.f16028e = string;
        SearchEditText searchEditText = this.f16024a;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    public final void d(boolean z8) {
        if (z8) {
            this.f16034y.setAlpha(this.f16017E);
            boolean isFocused = this.f16025b.isFocused();
            int i7 = this.f16015C;
            if (isFocused) {
                this.f16024a.setTextColor(i7);
                this.f16024a.setHintTextColor(i7);
            } else {
                this.f16024a.setTextColor(this.f16013A);
                this.f16024a.setHintTextColor(i7);
            }
        } else {
            this.f16034y.setAlpha(this.f16016D);
            this.f16024a.setTextColor(this.f16035z);
            this.f16024a.setHintTextColor(this.f16014B);
        }
        c();
    }

    public Drawable getBadgeDrawable() {
        return this.f16030u;
    }

    public CharSequence getHint() {
        return this.f16028e;
    }

    public String getTitle() {
        return this.f16029f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16020H = new SoundPool(2, 1, 0);
        int[] iArr = {R.raw.lb_voice_failure, R.raw.lb_voice_open, R.raw.lb_voice_no_input, R.raw.lb_voice_success};
        for (int i7 = 0; i7 < 4; i7++) {
            int i10 = iArr[i7];
            this.f16021I.put(i10, this.f16020H.load(this.f16023K, i10, 1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        this.f16020H.release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f16034y = ((RelativeLayout) findViewById(R.id.lb_search_bar_items)).getBackground();
        this.f16024a = (SearchEditText) findViewById(R.id.lb_search_text_editor);
        ImageView imageView = (ImageView) findViewById(R.id.lb_search_bar_badge);
        this.f16026c = imageView;
        Drawable drawable = this.f16030u;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        this.f16024a.setOnFocusChangeListener(new C2(this, 0));
        this.f16024a.addTextChangedListener(new E2(this, new D2(this, 0)));
        this.f16024a.setOnKeyboardDismissListener(new T(this));
        this.f16024a.setOnEditorActionListener(new S0(this, 1));
        this.f16024a.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(R.id.lb_search_bar_speech_orb);
        this.f16025b = speechOrbView;
        speechOrbView.setOnOrbClickedListener(new Q0(this, 2));
        this.f16025b.setOnFocusChangeListener(new C2(this, 1));
        d(hasFocus());
        c();
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f16030u = drawable;
        ImageView imageView = this.f16026c;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            if (drawable != null) {
                this.f16026c.setVisibility(0);
            } else {
                this.f16026c.setVisibility(8);
            }
        }
    }

    @Override // android.view.View
    public void setNextFocusDownId(int i7) {
        this.f16025b.setNextFocusDownId(i7);
        this.f16024a.setNextFocusDownId(i7);
    }

    public void setPermissionListener(H2 h22) {
    }

    public void setSearchAffordanceColors(K2 k22) {
        SpeechOrbView speechOrbView = this.f16025b;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(k22);
        }
    }

    public void setSearchAffordanceColorsInListening(K2 k22) {
        SpeechOrbView speechOrbView = this.f16025b;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(k22);
        }
    }

    public void setSearchBarListener(G2 g2) {
    }

    public void setSearchQuery(String str) {
        b();
        this.f16024a.setText(str);
        setSearchQueryInternal(str);
    }

    public void setSearchQueryInternal(String str) {
        if (TextUtils.equals(this.f16027d, str)) {
            return;
        }
        this.f16027d = str;
    }

    @Deprecated
    public void setSpeechRecognitionCallback(h3 h3Var) {
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        b();
        SpeechRecognizer speechRecognizer2 = this.f16018F;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
            if (this.f16019G) {
                this.f16018F.cancel();
                this.f16019G = false;
            }
        }
        this.f16018F = speechRecognizer;
    }

    public void setTitle(String str) {
        this.f16029f = str;
        c();
    }
}
