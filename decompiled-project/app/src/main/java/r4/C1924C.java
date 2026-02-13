package r4;

import A8.c0;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import m4.AbstractC1571h;
import n5.AbstractC1705a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q4.InterfaceC1888a;

/* renamed from: r4.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1924C implements y {

    /* renamed from: d, reason: collision with root package name */
    public static final n4.c f23700d = new n4.c(29);

    /* renamed from: a, reason: collision with root package name */
    public final UUID f23701a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f23702b;

    /* renamed from: c, reason: collision with root package name */
    public int f23703c;

    public C1924C(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = AbstractC1571h.f20383b;
        AbstractC1705a.g("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f23701a = uuid;
        MediaDrm mediaDrm = new MediaDrm((n5.D.f21141a >= 27 || !AbstractC1571h.f20384c.equals(uuid)) ? uuid : uuid2);
        this.f23702b = mediaDrm;
        this.f23703c = 1;
        if (AbstractC1571h.f20385d.equals(uuid) && "ASUS_Z00AD".equals(n5.D.f21144d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // r4.y
    public final void b(byte[] bArr, byte[] bArr2) {
        this.f23702b.restoreKeys(bArr, bArr2);
    }

    @Override // r4.y
    public final Map c(byte[] bArr) {
        return this.f23702b.queryKeyStatus(bArr);
    }

    @Override // r4.y
    public final void e(byte[] bArr) {
        this.f23702b.closeSession(bArr);
    }

    @Override // r4.y
    public final void g(final o7.o oVar) {
        this.f23702b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: r4.A
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i7, int i10, byte[] bArr2) {
                C1924C c1924c = C1924C.this;
                o7.o oVar2 = oVar;
                c1924c.getClass();
                c0 c0Var = ((C1934f) oVar2.f22101b).f23755x;
                c0Var.getClass();
                c0Var.obtainMessage(i7, bArr).sendToTarget();
            }
        });
    }

    @Override // r4.y
    public final void h(byte[] bArr, n4.l lVar) {
        if (n5.D.f21141a >= 31) {
            try {
                AbstractC1923B.b(this.f23702b, bArr, lVar);
            } catch (UnsupportedOperationException unused) {
                AbstractC1705a.S("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // r4.y
    public final byte[] j(byte[] bArr, byte[] bArr2) {
        if (AbstractC1571h.f20384c.equals(this.f23701a) && n5.D.f21141a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(n5.D.o(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    if (i7 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(M6.e.f6799c);
            } catch (JSONException e2) {
                AbstractC1705a.u("ClearKeyUtil", "Failed to adjust response data: ".concat(n5.D.o(bArr2)), e2);
            }
        }
        return this.f23702b.provideKeyResponse(bArr, bArr2);
    }

    @Override // r4.y
    public final x k() {
        MediaDrm.ProvisionRequest provisionRequest = this.f23702b.getProvisionRequest();
        return new x(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // r4.y
    public final void l(byte[] bArr) {
        this.f23702b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x019f, code lost:
    
        if (r5 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        if ("AFTT".equals(r5) == false) goto L80;
     */
    @Override // r4.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w m(byte[] bArr, List list, int i7, HashMap hashMap) {
        byte[] bArr2;
        String str;
        C1935g c1935g;
        byte[] bArr3;
        UUID uuid = this.f23701a;
        C1935g c1935g2 = null;
        if (list != null) {
            if (AbstractC1571h.f20385d.equals(uuid)) {
                if (n5.D.f21141a >= 28 && list.size() > 1) {
                    C1935g c1935g3 = (C1935g) list.get(0);
                    int i10 = 0;
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        C1935g c1935g4 = (C1935g) list.get(i11);
                        byte[] bArr4 = c1935g4.f23760e;
                        bArr4.getClass();
                        if (n5.D.a(c1935g4.f23759d, c1935g3.f23759d) && n5.D.a(c1935g4.f23758c, c1935g3.f23758c) && A4.o.e(bArr4) != null) {
                            i10 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i10];
                    int i12 = 0;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        byte[] bArr6 = ((C1935g) list.get(i13)).f23760e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i12, length);
                        i12 += length;
                    }
                    c1935g = new C1935g(c1935g3.f23757b, c1935g3.f23758c, c1935g3.f23759d, bArr5);
                }
                for (int i14 = 0; i14 < list.size(); i14++) {
                    C1935g c1935g5 = (C1935g) list.get(i14);
                    byte[] bArr7 = c1935g5.f23760e;
                    bArr7.getClass();
                    A4.s e2 = A4.o.e(bArr7);
                    int i15 = e2 == null ? -1 : e2.f470a;
                    int i16 = n5.D.f21141a;
                    if ((i16 < 23 && i15 == 0) || (i16 >= 23 && i15 == 1)) {
                        c1935g = c1935g5;
                        break;
                    }
                }
                c1935g = (C1935g) list.get(0);
            } else {
                c1935g = (C1935g) list.get(0);
            }
            byte[] bArr8 = c1935g.f23760e;
            bArr8.getClass();
            UUID uuid2 = AbstractC1571h.f20386e;
            if (uuid2.equals(uuid)) {
                byte[] f4 = A4.o.f(bArr8, uuid);
                if (f4 != null) {
                    bArr8 = f4;
                }
                n5.v vVar = new n5.v(bArr8);
                int j = vVar.j();
                short l10 = vVar.l();
                short l11 = vVar.l();
                if (l10 == 1 && l11 == 1) {
                    short l12 = vVar.l();
                    Charset charset = M6.e.f6801e;
                    String t5 = vVar.t(l12, charset);
                    if (!t5.contains("<LA_URL>")) {
                        int indexOf = t5.indexOf("</DATA>");
                        if (indexOf == -1) {
                            AbstractC1705a.S("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = t5.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + t5.substring(indexOf);
                        int i17 = j + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i17);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i17);
                        allocate.putShort(l10);
                        allocate.putShort(l11);
                        allocate.putShort((short) (str2.length() * 2));
                        allocate.put(str2.getBytes(charset));
                        bArr8 = allocate.array();
                    }
                } else {
                    AbstractC1705a.B("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr8 = A4.o.a(uuid2, null, bArr8);
            }
            int i18 = n5.D.f21141a;
            if (i18 >= 23 || !AbstractC1571h.f20385d.equals(uuid)) {
                if (uuid2.equals(uuid) && "Amazon".equals(n5.D.f21143c)) {
                    String str3 = n5.D.f21144d;
                    if (!"AFTB".equals(str3)) {
                        if (!"AFTS".equals(str3)) {
                            if (!"AFTM".equals(str3)) {
                            }
                        }
                    }
                }
                bArr3 = bArr8;
                String str4 = c1935g.f23759d;
                str = (i18 < 26 && AbstractC1571h.f20384c.equals(uuid) && ("video/mp4".equals(str4) || "audio/mp4".equals(str4))) ? "cenc" : str4;
                bArr2 = bArr3;
                c1935g2 = c1935g;
            }
            bArr3 = A4.o.f(bArr8, uuid);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f23702b.getKeyRequest(bArr, bArr2, str, i7, hashMap);
        byte[] data = keyRequest.getData();
        if (AbstractC1571h.f20384c.equals(uuid) && n5.D.f21141a < 27) {
            data = n5.D.o(data).replace('+', '-').replace('/', '_').getBytes(M6.e.f6799c);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl) || (n5.D.f21141a == 33 && "https://default.url".equals(defaultUrl))) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && c1935g2 != null) {
            String str5 = c1935g2.f23758c;
            if (!TextUtils.isEmpty(str5)) {
                defaultUrl = str5;
            }
        }
        if (n5.D.f21141a >= 23) {
            keyRequest.getRequestType();
        }
        return new w(defaultUrl, data);
    }

    @Override // r4.y
    public final int n() {
        return 2;
    }

    @Override // r4.y
    public final InterfaceC1888a o(byte[] bArr) {
        int i7 = n5.D.f21141a;
        UUID uuid = this.f23701a;
        boolean z8 = i7 < 21 && AbstractC1571h.f20385d.equals(uuid) && "L3".equals(this.f23702b.getPropertyString("securityLevel"));
        if (i7 < 27 && AbstractC1571h.f20384c.equals(uuid)) {
            uuid = AbstractC1571h.f20383b;
        }
        return new z(uuid, bArr, z8);
    }

    @Override // r4.y
    public final boolean q(String str, byte[] bArr) {
        if (n5.D.f21141a >= 31) {
            return AbstractC1923B.a(this.f23702b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f23701a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // r4.y
    public final byte[] r() {
        return this.f23702b.openSession();
    }

    @Override // r4.y
    public final synchronized void release() {
        int i7 = this.f23703c - 1;
        this.f23703c = i7;
        if (i7 == 0) {
            this.f23702b.release();
        }
    }
}
