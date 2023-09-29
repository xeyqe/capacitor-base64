import { WebPlugin } from '@capacitor/core';

import type { Base64Plugin } from './definitions';

export class Base64Web extends WebPlugin implements Base64Plugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
