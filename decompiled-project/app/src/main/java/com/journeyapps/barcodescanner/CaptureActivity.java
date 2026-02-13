package com.journeyapps.barcodescanner;

import F6.j;
import P8.a;
import P8.d;
import T8.e;
import T8.f;
import T8.g;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import com.kt.apps.media.xemtv.beta.R;
import ea.C1108c;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import k1.c;
import l1.AbstractC1449a;
import n5.u;
import o7.o;
import p9.i;

/* loaded from: classes2.dex */
public class CaptureActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public i f15891a;

    /* renamed from: b, reason: collision with root package name */
    public DecoratedBarcodeView f15892b;

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARN: Type inference failed for: r8v4, types: [P8.i, java.lang.Object] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Set set;
        Bundle extras;
        q9.i iVar;
        String stringExtra;
        int intExtra;
        int i7;
        super.onCreate(bundle);
        setContentView(R.layout.zxing_capture);
        this.f15892b = (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
        DecoratedBarcodeView decoratedBarcodeView = this.f15892b;
        i iVar2 = new i(this, decoratedBarcodeView);
        this.f15891a = iVar2;
        Intent intent = getIntent();
        getWindow().addFlags(128);
        if (bundle != null) {
            iVar2.f23193c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                if (iVar2.f23193c == -1) {
                    int rotation = getWindowManager().getDefaultDisplay().getRotation();
                    int i10 = getResources().getConfiguration().orientation;
                    if (i10 == 2) {
                        if (rotation != 0 && rotation != 1) {
                            i7 = 8;
                            iVar2.f23193c = i7;
                        }
                        i7 = 0;
                        iVar2.f23193c = i7;
                    } else {
                        if (i10 == 1) {
                            i7 = (rotation == 0 || rotation == 3) ? 1 : 9;
                            iVar2.f23193c = i7;
                        }
                        i7 = 0;
                        iVar2.f23193c = i7;
                    }
                }
                setRequestedOrientation(iVar2.f23193c);
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                Pattern pattern = e.f9371a;
                String stringExtra2 = intent.getStringExtra("SCAN_FORMATS");
                EnumMap enumMap = null;
                List asList = stringExtra2 != null ? Arrays.asList(e.f9371a.split(stringExtra2)) : null;
                String stringExtra3 = intent.getStringExtra("SCAN_MODE");
                if (asList != null) {
                    set = EnumSet.noneOf(a.class);
                    try {
                        Iterator it = asList.iterator();
                        while (it.hasNext()) {
                            set.add(a.valueOf((String) it.next()));
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    int i11 = f.f9373a;
                    extras = intent.getExtras();
                    if (extras != null && !extras.isEmpty()) {
                        enumMap = new EnumMap(d.class);
                        for (d dVar : d.values()) {
                            if (dVar != d.f8199e && dVar != d.f8204x && dVar != d.f8197c) {
                                String name = dVar.name();
                                if (extras.containsKey(name)) {
                                    Class cls = dVar.f8207a;
                                    if (cls.equals(Void.class)) {
                                        enumMap.put((EnumMap) dVar, (d) Boolean.TRUE);
                                    } else {
                                        Object obj = extras.get(name);
                                        if (cls.isInstance(obj)) {
                                            enumMap.put((EnumMap) dVar, (d) obj);
                                        } else {
                                            Log.w("f", "Ignoring hint " + dVar + " because it is not assignable from " + obj);
                                        }
                                    }
                                }
                            }
                        }
                        Log.i("f", "Hints from the Intent: " + enumMap);
                    }
                    iVar = new q9.i();
                    if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
                        iVar.f23587a = intExtra;
                    }
                    if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
                        decoratedBarcodeView.f15893a.setTorch(true);
                    }
                    stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
                    if (stringExtra != null) {
                        decoratedBarcodeView.setStatusText(stringExtra);
                    }
                    int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
                    String stringExtra4 = intent.getStringExtra("CHARACTER_SET");
                    new Object().c(enumMap);
                    decoratedBarcodeView.f15893a.setCameraSettings(iVar);
                    BarcodeView barcodeView = decoratedBarcodeView.f15893a;
                    u uVar = new u(3);
                    uVar.f21223c = set;
                    uVar.f21224d = enumMap;
                    uVar.f21225e = stringExtra4;
                    uVar.f21222b = intExtra2;
                    barcodeView.setDecoderFactory(uVar);
                }
                set = stringExtra3 != null ? (Set) e.f9372b.get(stringExtra3) : null;
                int i112 = f.f9373a;
                extras = intent.getExtras();
                if (extras != null) {
                    enumMap = new EnumMap(d.class);
                    while (r14 < r13) {
                    }
                    Log.i("f", "Hints from the Intent: " + enumMap);
                }
                iVar = new q9.i();
                if (intent.hasExtra("SCAN_CAMERA_ID")) {
                    iVar.f23587a = intExtra;
                }
                if (intent.hasExtra("TORCH_ENABLED")) {
                    decoratedBarcodeView.f15893a.setTorch(true);
                }
                stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
                if (stringExtra != null) {
                }
                int intExtra22 = intent.getIntExtra("SCAN_TYPE", 0);
                String stringExtra42 = intent.getStringExtra("CHARACTER_SET");
                new Object().c(enumMap);
                decoratedBarcodeView.f15893a.setCameraSettings(iVar);
                BarcodeView barcodeView2 = decoratedBarcodeView.f15893a;
                u uVar2 = new u(3);
                uVar2.f21223c = set;
                uVar2.f21224d = enumMap;
                uVar2.f21225e = stringExtra42;
                uVar2.f21222b = intExtra22;
                barcodeView2.setDecoderFactory(uVar2);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                iVar2.f23198i.f920a = false;
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                boolean booleanExtra = intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true);
                String stringExtra5 = intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE");
                iVar2.f23195e = booleanExtra;
                if (stringExtra5 == null) {
                    stringExtra5 = "";
                }
                iVar2.f23196f = stringExtra5;
            }
            if (intent.hasExtra("TIMEOUT")) {
                iVar2.j.postDelayed(new p9.f(iVar2, 1), intent.getLongExtra("TIMEOUT", 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                iVar2.f23194d = true;
            }
        }
        i iVar3 = this.f15891a;
        o oVar = iVar3.f23199l;
        DecoratedBarcodeView decoratedBarcodeView2 = iVar3.f23192b;
        BarcodeView barcodeView3 = decoratedBarcodeView2.f15893a;
        C1108c c1108c = new C1108c(10, decoratedBarcodeView2, oVar, false);
        barcodeView3.f15886O = 2;
        barcodeView3.f15887P = c1108c;
        barcodeView3.h();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        i iVar = this.f15891a;
        iVar.g = true;
        iVar.f23197h.c();
        iVar.j.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        return this.f15892b.onKeyDown(i7, keyEvent) || super.onKeyDown(i7, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        i iVar = this.f15891a;
        iVar.f23197h.c();
        BarcodeView barcodeView = iVar.f23192b.f15893a;
        q9.f cameraInstance = barcodeView.getCameraInstance();
        barcodeView.g();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.g && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        i iVar = this.f15891a;
        iVar.getClass();
        if (i7 == 250) {
            if (iArr.length > 0 && iArr[0] == 0) {
                iVar.f23192b.f15893a.c();
                return;
            }
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("MISSING_CAMERA_PERMISSION", true);
            iVar.f23191a.setResult(0, intent);
            if (iVar.f23195e) {
                iVar.b(iVar.f23196f);
            } else {
                iVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        i iVar = this.f15891a;
        CaptureActivity captureActivity = iVar.f23191a;
        if (AbstractC1449a.checkSelfPermission(captureActivity, "android.permission.CAMERA") == 0) {
            iVar.f23192b.f15893a.c();
        } else if (!iVar.f23200m) {
            c.a(captureActivity, new String[]{"android.permission.CAMERA"}, 250);
            iVar.f23200m = true;
        }
        g gVar = iVar.f23197h;
        if (!gVar.f9374a) {
            ((Activity) gVar.f9376c).registerReceiver((j) gVar.f9377d, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            gVar.f9374a = true;
        }
        ((Handler) gVar.f9378e).removeCallbacksAndMessages(null);
        if (gVar.f9375b) {
            ((Handler) gVar.f9378e).postDelayed((p9.f) gVar.f9379f, 300000L);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f15891a.f23193c);
    }
}
