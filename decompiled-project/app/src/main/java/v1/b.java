package v1;

import A0.B;
import C4.C0244f;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import u.C2066t;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2066t f24933a = new C2066t(2);

    /* renamed from: b, reason: collision with root package name */
    public static final B f24934b = new B(23);

    public static C0244f a(Context context, List list) {
        Trace.beginSection(vc.i.I("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                c cVar = (c) list.get(i7);
                ProviderInfo b2 = b(context.getPackageManager(), cVar, context.getResources());
                if (b2 == null) {
                    C0244f c0244f = new C0244f(1);
                    Trace.endSection();
                    return c0244f;
                }
                arrayList.add(c(context, cVar, b2.authority));
            }
            C0244f c0244f2 = new C0244f(arrayList);
            Trace.endSection();
            return c0244f2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [v1.a, java.lang.Object] */
    public static ProviderInfo b(PackageManager packageManager, c cVar, Resources resources) {
        Trace.beginSection(vc.i.I("FontProvider.getProvider"));
        try {
            List list = cVar.f24938d;
            String str = cVar.f24935a;
            String str2 = cVar.f24936b;
            if (list == null) {
                list = n1.b.l(resources, 0);
            }
            ?? obj = new Object();
            obj.f24930a = str;
            obj.f24931b = str2;
            obj.f24932c = list;
            C2066t c2066t = f24933a;
            ProviderInfo providerInfo = (ProviderInfo) c2066t.get(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(str));
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            B b2 = f24934b;
            Collections.sort(arrayList, b2);
            for (int i7 = 0; i7 < list.size(); i7++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i7));
                Collections.sort(arrayList2, b2);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                            break;
                        }
                    }
                    c2066t.put(obj, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static h[] c(Context context, c cVar, String str) {
        Trace.beginSection(vc.i.I("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(vc.i.I("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {cVar.f24937c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e2) {
                            Log.w("FontsProvider", "Unable to query the content provider", e2);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i7 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new h(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i7));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (h[]) arrayList.toArray(new h[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
