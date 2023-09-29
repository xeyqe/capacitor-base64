import { WebPlugin } from '@capacitor/core';

import type { Base64Plugin } from './definitions';

export class Base64Web extends WebPlugin implements Base64Plugin {
  getBase64(options: { path: string }): Promise<{ base64: string }> {
    console.log('getBase64', options);
    return Promise.resolve({ base64: 'getBase64' });
  }
}
